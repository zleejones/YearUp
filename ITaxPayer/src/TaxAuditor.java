
public class TaxAuditor 
{
	void Audit(ITaxPayer taxPayer)
	{
		System.out.println("Audited: " + taxPayer.getClass());
	}

}
