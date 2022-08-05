package phase_1_project.lockedme_application;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.IOException;
public class Files 
{
	public static void main(String[] args)
	{
		System.out.println("\n************************\n"
	            +"\nLOCKEDME APPLICATION\n"
	            +"\n************************\n"
	            +"\n BY RIYANA SAFFRIN\n"
				+"\n************************\n");
		File new_folder = new File("new_folder");
		new_folder.mkdir();
		optionSelection(new_folder);
	}
	private static void optionSelection(File new_folder) 
	{
		String[] array = {"1.Retreive the file in an ascending order\n", 
			          "2.Business level operations\n",
			          "3.Exit the application\n" };
		int[] arr={1,2,3};
		int len=arr.length;
		System.out.println();
		for (int i=0;i<len;i++) 
		{
			System.out.println(array[i]);
		}
		System.out.println("Please enter any options:");
		Scanner scan=new Scanner(System.in);
		int options=scan.nextInt();
		switch(options) 
		{
		case 1:
			String[] file_names=new String[100];
			file_names=new_folder.list();
			if(file_names.length==0) 
			{
				System.out.println("No file exixts");
			}
			else 
			{
				Arrays.sort(file_names);
				System.out.println("List of files: ");
				for(String name:file_names) 
				{
					System.out.println(name);
				}
			}
			optionSelection(new_folder);
			break;
		case 2:
			System.out.println("Business Level Operations");
			lockedme(new_folder);
			break;
		case 3:
			System.out.println("Closing your application... \nThank you!");
			break;
		default:
			System.out.println("Please enter correct option");
			optionSelection(new_folder);
			break;
		}
	}
	private static void lockedme(File new_folder)
	{
		System.out.println("1.Add file\n" 
                     + "2.Delete file\n" 
			         + "3.Search file\n" 
                     + "4.Go back to main menu\n");
		System.out.println("****Please enter your choice****");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) 
		{
	
		case 1:
			System.out.println("Adding a file\n");
			System.out.println("Enter the file name");
			String newFile=new Scanner(System.in).nextLine();
			File add_file=new File(new_folder, newFile);
			try
			{
				if(add_file.createNewFile())
				System.out.println("File is added");
				else
				System.out.println("File name already exists");
		    } 
			catch(IOException e)
			{
				System.out.println("Error :"+e.getMessage());
			}
			lockedme(new_folder);
			break;
	
		case 2:
			System.out.println("Delete a file");
			System.out.println("Enter the file name to be deleted :");
			String file_name=new Scanner(System.in).nextLine();
			File delete_file=new File(new_folder, file_name);
			if(delete_file.exists()) 
			{
				if(delete_file.delete()) 
				{
					System.out.println("File is deleted");
				} 
				else
					System.out.println("File can't delete");
			} 
			else
				System.out.println("File does not exists");
				lockedme(new_folder);
				break;
	
		case 3:
			System.out.println("Search  file");
			System.out.println("Enter the file name to be searched");
			String s_file=new Scanner(System.in).nextLine();
			File search_file=new File(new_folder, s_file);
			if(search_file.exists()) 
			{
				System.out.println("File is found");
			} 
			else
				System.out.println("File does not found");
				lockedme(new_folder);
				break;
	
		case 4:
			System.out.println("Go back to main menu");
			optionSelection(new_folder);
			break;
	
		default:
			System.out.println("Please enter correct option");
			lockedme(new_folder);
			break;
		}
	
}}