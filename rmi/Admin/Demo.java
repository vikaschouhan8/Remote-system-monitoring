import java.io.*;
class Demo
{
	public static void main(String[] args) {
		int counter=0;
		File f[] = File.listRoots();
		for (int i=0;i< f.length ;i++ ) {
			counter++;
			System.out.print(f[i]+"\n");
		}
		System.out.print("No. Of Drives In The System Are "+counter);
		/*File ff = newFile("C:\\");
		String s[] = ff.list();
		for (String x:s) {
			System.out.print(x);
		}*/
	}
}