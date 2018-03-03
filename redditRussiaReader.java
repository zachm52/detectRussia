import java.io.BufferedReader;
import java.io.FileReader;
public class redditRussiaReader {


		String fileToAnalyze;
	
		redditRussiaReader()
		{
			fileToAnalyze="";
		}
		
		int numberMentions = 0;
		
		boolean detectRussia(String lineToAnalyze)
			{
			
			String lineToAnalyzeLowerCase=lineToAnalyze.toLowerCase();
			
			if (lineToAnalyzeLowerCase.contains("russia"))
			{
				//System.out.println("Detected Russia");
				return true;
			}
			
			else if (lineToAnalyzeLowerCase.contains("putin"))
			{
				//System.out.println("Detected Putin");
				return true;
			}
			
			else
			{
				return false;
			}
			}
		
		public void readRedditFile(String fileToRead)
		{
			System.out.println("Ready to read:" +fileToRead);
		
			
	
			try
			{
				FileReader myFileReader = new FileReader(fileToRead);
				System.out.println("I was able to find the file.");
				BufferedReader myBufferedReader = new BufferedReader(myFileReader);
				System.out.println("Ready to start buffering.");
				
				String line = null;
				while ((line= myBufferedReader.readLine())!=null)
				{		
				
				
				
				if (detectRussia(line)==true)	
				{
				numberMentions= numberMentions + 1;
				}
				else
				
				
				
				
				{
					
				}
				
				
				
				}	
						
		
			}
			catch (Exception ex)
			{
				System.out.println("Sorry I was not able to find the file.");
			}	
	System.out.println("Russia was mentioned "+numberMentions +" times");
	}
	
}