package testtest;

public class test {
	
	public static void main(String[] args) {
		
		String ds = "pdb_zzzzzzaaaa.tar";
		String dsTmp = "";
		
		if(ds.indexOf("pdb_") != -1) {
			dsTmp = ds.substring(ds.indexOf("pdb_") + 4);
		}
		
		System.out.println(dsTmp);
		
	}

}
