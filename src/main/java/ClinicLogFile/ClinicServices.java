package ClinicLogFile;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;


public class ClinicServices {
	 private ClinicServices() {
	    }

	    public static void writeCsv(List<ClinicRecords> cllist, List<Precords> nrlist) {
	        try (CSVWriter writer = new CSVWriter(new FileWriter("FinalClinicReport.csv"))) {
	            for (int i = 0; i < cllist.size(); i++) {
	            	ClinicRecords c = cllist.get(i);
	                String[] str = { c.getDate(), c.getRegion(), c.getClinictype(), String.valueOf(c.getRecs()), c.getSeqno() };
	                writer.writeNext(str);
	                writer.flush();
	            }
	            for (int j = 0; j < nrlist.size(); j++) {
	            	Precords r = nrlist.get(j);
	                String[] str2 = { r.getId(), r.getRefno(), String.valueOf(r.getAge()), String.valueOf(r.Lvalues[5]),
	                        String.valueOf(r.Lvalues[1]), String.valueOf(r.Lvalues[0]), String.valueOf(r.Lvalues[3]),
	                        String.valueOf(r.Lvalues[2]), String.valueOf(r.Lvalues[4]) };
	                writer.writeNext(str2);
	                writer.flush();
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void checkList(List<Precords> relist, List<ClinicRecords> cllist, int rno, int count) {
	        List<Precords> nrlist = new ArrayList<Precords>();
	        List<Precords> drlist = new ArrayList<Precords>();

	        if (rno == count) {
	            for (int k = 0; k < relist.size(); k++) {
	            	Precords r1 = relist.get(k);
	                if (r1.Lvalues[5] > 0 && r1.getAge() > 0 && r1.Lvalues[1] > 0 && r1.Lvalues[0] > 0 && r1.Lvalues[3] > 0
	                        && r1.Lvalues[2] > 0 && r1.getRefno() != null && r1.Lvalues[4] > 0 && checkAgeVale(r1.Lvalues[3],r1.getAge())==10 && checkLcdPcs(r1.Lvalues[1],r1.Lvalues[2])==1) {
	                            System.out.println(r1.getRefno() + ": Checked");
	                            nrlist.add(r1);
	                    }else {
	                    System.out.println(r1.getRefno() + ": Record Incomplete!");
	                    drlist.add(r1);
	                }
	        }
	    }else{
	        System.out.println("Records do not match the total count!");
	    System.out.println("Correct List");
	        }
	    for(int m = 0;m<nrlist.size();m++){
	    	Precords nr = nrlist.get(m);
	        System.out.println(nr);
	    }
	    System.out.println("Incorrect List");for(
	    int n = 0;n<drlist.size();n++)
	    {
	    	Precords dr = drlist.get(n);
	        System.out.println(dr);
	    }System.out.println("Want to convert checked record to CSV: (y/n)");
	    Scanner se = new Scanner(System.in);
	    String ch = se.next();if(ch.equalsIgnoreCase("y"))
	    {
	        writeCsv(cllist, nrlist);
	    }else
	    {
	        System.out.println("Thank You");
	    }se.close();
	    }

	    public static int checkAgeVale(double a, double b) {
	        if(a>5.0 && b<45 ){
	            return 10;
	        }else{
	        return 0;
	        }
	    }

	    public static int checkLcdPcs(double x, double y) {
	        if(x<10.0 && y<10.0 ){
	            return 1;
	        }else{
	        return 0;
	        }
	    }
}
