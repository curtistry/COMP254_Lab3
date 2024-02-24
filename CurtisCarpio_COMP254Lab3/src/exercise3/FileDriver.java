package exercise3;
import java.io.File;

public class FileDriver {

	public static File find(String path, String filename)
	{
		//convert path string to a file, which allows access of its children.
		File file = new File(path);
		//System.out.println(file.getAbsolutePath());
		
		//search the file if it's a directory
		if (file.isDirectory())
		{
			File[] parent = file.listFiles();
			
			for (File child : parent)
			{
				 File found = find(child.getAbsolutePath(), filename);
	                if (found != null) {
	                    return found; // file is found.
	                }
			}
		}
		
		//if not a directory, compare file names
		else if (file.isFile()) {
	        if (file.getName().equals(filename)) {
	            return file; // names match, file found.
	        } else {
	            return null; // names do not match
	        }
	    }
		return null;	// the file was not found.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Curtis\\Documents\\COMP 254";
		String filename = "someDocument.txt";
		File result = find(path,filename);
		System.out.printf("%s was found.\nPath: %s",filename,result.getAbsolutePath());
	}

}
