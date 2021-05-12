package ClinicLogFile;

public class ClinicRecords {
	 private String date;
	    private String region;
	    private String clinictype;
	    private int recs;
	    private String seqno;
	    
	    
		public ClinicRecords(String date, String region, String clinictype, int recs, String seqno) {
			super();
			this.date = date;
			this.region = region;
			this.clinictype = clinictype;
			this.recs = recs;
			this.seqno = seqno;
		}


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}


		public String getRegion() {
			return region;
		}


		public void setRegion(String region) {
			this.region = region;
		}


		public String getClinictype() {
			return clinictype;
		}


		public void setClinictype(String clinictype) {
			this.clinictype = clinictype;
		}


		public int getRecs() {
			return recs;
		}


		public void setRecs(int recs) {
			this.recs = recs;
		}


		public String getSeqno() {
			return seqno;
		}


		public void setSeqno(String seqno) {
			this.seqno = seqno;
		}


		@Override
		public String toString() {
			return "ClinicRecords [date=" + date + ", region=" + region + ", clinictype=" + clinictype + ", recs="
					+ recs + ", seqno=" + seqno + "]";
		}
		
		
	    
}
