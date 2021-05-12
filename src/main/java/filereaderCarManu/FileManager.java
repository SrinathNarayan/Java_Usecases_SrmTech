package filereaderCarManu;

import java.io.IOException;
import java.util.logging.Logger;

public class FileManager {
	static Logger log = Logger.getLogger(FileManager.class.getName());
    public static void main(String[] args) throws IOException {

		
		log.info("Create the File");
		new FileImpelmentation();
        FileImpelmentation.CreateNewFile();
		
		
		log.info("It Will Display All Records");
	    new FileImpelmentation().display();
		
		
	}
}
