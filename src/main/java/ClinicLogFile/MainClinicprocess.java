package ClinicLogFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClinicprocess {
	  public static void main(String[] args) throws IOException {
	        Path file = Paths.get("Records.txt");
	        List<String> lines = new ArrayList<String>();
	        List<String> heads = new ArrayList<String>();
	        ArrayList<ClinicRecords> clist = new ArrayList<ClinicRecords>();
	        ArrayList<Precords> rlist = new ArrayList<Precords>();
	        String line;
	        String head;
	        String[] fields;
	        String[] hfield;
	        String date;
	        String region;
	        String ctype;
	        int norec;
	        String seq;
	        String id;
	        String ref;
	        int age;
	        try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {

	            head = br.readLine();
	            heads.add(head);
	            for (int j = 0; j < heads.size(); j++) {
	                hfield = heads.get(j).split("%");
	                date = hfield[0];
	                region = hfield[1];
	                ctype = hfield[3];
	                norec = Integer.parseInt(hfield[6]);
	                seq = hfield[15];

	                clist.add(new ClinicRecords(date, region, ctype, norec, seq));

	            }
	            while ((line = br.readLine()) != null) {
	                lines.add(line);
	            }

	            for (int j = 0; j < lines.size(); j++) {
	                fields = lines.get(j).split("%");
	                double[] values = new double[6];
	                id = fields[0];
	                ref = fields[4];
	                values[0] = Double.parseDouble(fields[10]);
	                values[1] = Double.parseDouble(fields[16]);
	                values[2] = Double.parseDouble(fields[23]);
	                values[3] = Double.parseDouble(fields[30]);
	                values[4] = Double.parseDouble(fields[38]);
	                values[5] = Double.parseDouble(fields[48]);
	                age = Integer.parseInt(fields[59]);

	                rlist.add(new Precords(id, ref, values, age));
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	        System.out.println("Clinic:");
	        for (int m = 0; m < clist.size(); m++) {
	        	ClinicRecords c = clist.get(m);
	            System.out.println(c);
	        }

	        System.out.println("Checking clinic Seq.Number Records: ");
	        getClinicRecords(rlist, clist.get(0).getSeqno());

	        checkRecords(rlist, clist);
	        System.out.close();

	    }

	    public static void getClinicRecords(List<Precords> reclist, String sno) {
	        reclist.stream().filter(r -> r.getId().startsWith(sno)).collect(Collectors.toList())
	                .forEach(System.out::println);
	    }

	    public static void checkRecords(List<Precords> relist, List<ClinicRecords> cllist) {
	        Scanner se = new Scanner(System.in);
	        int rno = 0;
	        int count = 0;
	        System.out.println("Enter the Clinic Seq Number:");
	        String seq3 = se.next();
	        for (int i = 0; i < cllist.size(); i++) {
	        	ClinicRecords c = cllist.get(i);
	            if (c.getSeqno().equalsIgnoreCase(seq3)) {
	                rno += c.getRecs();
	            }
	        }

	        for (int j = 0; j < relist.size(); j++) {
	            Precords r = relist.get(j);
	            if (r.getId().startsWith(seq3.toLowerCase()) || r.getId().startsWith(seq3.toUpperCase())) {
	                count += 1;
	            }
	        }
	        ClinicServices.checkList(relist, cllist, rno, count);
	        se.close();
	    }
}
