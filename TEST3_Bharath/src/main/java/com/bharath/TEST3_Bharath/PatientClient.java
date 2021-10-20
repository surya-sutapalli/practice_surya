package com.bharath.TEST3_Bharath;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatientClient 
{
	private  final static Logger logger = LoggerFactory.getLogger(PatientClient.class);
	public static void main( String[] args )
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f= cfg.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		int choice=0;
		while(true) {
			Scanner scan=new Scanner(System.in);
			logger.info("WELCOME TO PATIENT MANAGING APP");
			logger.info("");
			logger.info("please select one of option");
			logger.info("1.View");
			logger.info("2.Insert");
			logger.info("3.Update ");
			logger.info("4.Delete ");
			logger.info("5.Exit ");
			try {
				choice = scan.nextInt();
			} catch (InputMismatchException e) {
				logger.error("Please enter number type value only");
				continue;
			}
			catch (Exception e) {
				logger.error("Please enter valid value");
				continue;
			}
			if(choice>5||choice<=0) {
				logger.warn("please enter number values between 1 and 4");
				continue;
			}
			if(choice==5) {
				logger.info("THANK YOU FOR USING THE APPLICATION");
				System.exit(0);
			}
			if(choice==1) {
				viewPatient(s);
			}
			else if(choice==2)
			{
				InsertPatient(s,t);

			}
			else if(choice==3) {
				updatePatient(s,t);
			}
			else if(choice==4)
			{
				deletePatient(s,t);

			}
		}
	}
	private static void viewPatient(Session s) {
		logger.info("viewing all the patients");
		List l=s.createCriteria(Patient.class).list();
		Iterator i=	l.iterator();
		while(i.hasNext()) {
			Patient p=(Patient) i.next();
			logger.info(p.getPatientID()+"--"+p.getPatientName()+"--"+p.getPatientDisease());
		}
	}
	private static void deletePatient(Session s, Transaction t) {
		viewPatient(s);
		int choice=0;
		logger.info("Enter the id of the patient you want to delete ::");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		Patient p=(Patient) s.load(Patient.class, new Integer(choice));
		s.delete(p);
		t.commit();
	}
	private static void updatePatient(Session s, Transaction t) {
		viewPatient(s);
		int choice=0;
		String dis=null;
		int id=0;
		logger.info("Enter the id of the patient whome you want to update");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		Patient p=(Patient) s.load(Patient.class, new Integer(choice));
		logger.info("which one you want to update");
		logger.info("1.PATIENT ID");
		logger.info("2.PATIENT DISEASE");
		try {
			choice=sc.nextInt();
		} catch (Exception e) {
			logger.info("please enter valid values");
			updatePatient(s, t);
		}
		if(choice==1) {
			logger.info("enter the new ID  for the patient");
			id=sc.nextInt();
		try {
			Query q=	s.createQuery("update patient set patientid="+id+" where patientid="+choice);
			q.executeUpdate();
		} catch (Exception e) {
			logger.info("cannot update primary key value");
		}
			//p.setPatientID(id);
		}
		else if(choice==2) {
			logger.info("enter the new disease  for the patient");
			dis=sc.next();
			p.setPatientDisease(dis);
		}
		logger.info("patient details updated successfully");
		s.update(p);
		t.commit();
	}
	private static void InsertPatient(Session s, Transaction t) {
		int pid=0;
		String pname=null;
		String pdies=null;
		logger.info("insering a new patient");
		Patient p=new Patient();
		Scanner sc=new Scanner(System.in);
		logger.info("Enter the id of the patient");
		try {
			p.setPatientID(pid=sc.nextInt());
		} catch (Exception e) {
			logger.info("please enter valid values");
			InsertPatient(s, t);
		}	
		logger.info("Enter the name of the patient");
		p.setPatientName(pname=sc.next());	;
		logger.info("Enter the disease of the patient");
		p.setPatientDisease(pdies=sc.next());
		s.save(p);
		t.commit();
	}
}
