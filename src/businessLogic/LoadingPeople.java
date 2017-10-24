package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import data.Employee;
import data.Grad;
import data.Undergrad;
import data.FullTime;
import data.PartialTime;
import data.Administrative;
import data.ByContract;

public class LoadingPeople {

	public static Undergrad readUndergrad(Scanner sc) {
		Undergrad newUndergrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String hours = sc.next().trim();
		int h = Integer.parseInt(hours);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newUndergrad = new Undergrad(id, name,hiringDate,dp,h);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newUndergrad;
	}

	public static Grad readGrad(Scanner sc) {
		Grad newGrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String courses = sc.next().trim();
		int c = Integer.parseInt(courses);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newGrad = new Grad(id, name,hiringDate,dp,c);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newGrad;
	}
        
        public static FullTime readFullTime(Scanner sc){
            FullTime newFullT = null;
            
            String id = sc.next().trim();
            String name = sc.next().trim();
            String hd = sc.next().trim();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String sch = sc.next().trim();
            String dp = sc.next().trim();
            String salary = sc.next().trim();
            float s = Float.parseFloat(salary);
            
            Date hiringDate;
            try{
                hiringDate = ft.parse(hd);
                newFullT = new FullTime(id, name, hiringDate, sch, dp, s);
            } catch (ParseException e){
                System.out.println("Unparseable using " + ft);
                e.printStackTrace();
            }
            return newFullT;
        }
        
        public static PartialTime readPartialTime(Scanner sc){
            PartialTime newPartTime = null;
                
            String id = sc.next().trim();
            String name = sc.next().trim();
            String hd = sc.next().trim();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String sch = sc.next().trim();
            String dp = sc.next().trim();
            String cg = sc.next().trim();
            String ch = sc.next().trim();
            int h = Integer.parseInt(ch);
            
            Date hiringDate;
            try{
                hiringDate = ft.parse(hd);
                newPartTime = new PartialTime(id, name, hiringDate, sch, dp, cg, h);
            } catch (ParseException e){
                System.out.println("Unparseable using " + ft);
                e.printStackTrace();
            }
            return newPartTime;
        }
        
        public static Administrative readAdministrative(Scanner sc){
            Administrative newAdmin = null;
            
            String id = sc.next().trim();
            String name = sc.next().trim();
            String hd = sc.next().trim();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String cg = sc.next().trim();
            String sr = sc.next().trim();
            float s = Float.parseFloat(sr);
            
            Date hiringDate;
            try{
                hiringDate = ft.parse(hd);
                newAdmin = new Administrative(id, name, hiringDate, cg, s);
            } catch (ParseException e){
                System.out.println("Unparseable using " + ft);
                e.printStackTrace();
            }
            return newAdmin;
        }
        
        public static ByContract readByContract(Scanner sc){
            ByContract newContract = null;
            
            String id = sc.next().trim();
            String name = sc.next().trim();
            String hd = sc.next().trim();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String ms = sc.next().trim();
            int m = Integer.parseInt(ms);
            String vl = sc.next().trim();
            float v = Float.parseFloat(vl);
            
            Date hiringDate;
            try{
                hiringDate = ft.parse(hd);
                newContract = new ByContract(id, name, hiringDate, m, v);
            } catch (ParseException e){
                System.out.println("Unparseable using " + ft);
                e.printStackTrace();
            }
            return newContract;
        }

	public static Employee readEmployee(Scanner sc) {
		String type = sc.next().trim();
		if (type.equals("Grad")) return readGrad(sc);
                else if (type.equals("Undergrad")) return readUndergrad(sc);
                else if (type.equals("FullTime")) return readFullTime(sc);
                else if (type.equals("PartialTime")) return readPartialTime(sc);
                else if (type.equals("Administrative")) return readAdministrative(sc);
                else if (type.equals("ByContract")) return readByContract(sc);
                else throw new IllegalArgumentException("Tipo no encontrado.");
                
	}
	
	public static ArrayList<Employee> readStaff(String fileName) {
		ArrayList<Employee> people = new ArrayList<Employee>();
		Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				people.add(readEmployee(sc));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found -- " + fileName);
			e.printStackTrace();
		}
		return people;
	}
}
