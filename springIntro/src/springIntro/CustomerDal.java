package springIntro;

//Veritabanlar�n�n yaz�laca�� nesne yeri

public class CustomerDal implements ICustomerDal {
String connectionString;

	public String getConnectionString() {
	return connectionString;
}

public void setConnectionString(String connectionString) {
	this.connectionString = connectionString;
}

	public void add() {
		System.out.println("Connection String : " +this.connectionString);
		System.out.println("Oracle veritaban�na eklendi");
		
	}

}