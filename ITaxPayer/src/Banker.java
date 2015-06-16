
public class Banker implements ITaxPayer
{
	private double m_Income;
	private boolean m_donePayingTaxes = false;
	
	public Banker(double Income)
	{
		setIncome(Income);
	}
	public double getIncome()
	{
		return m_Income;
	}
	
	private void setIncome(double Income)
	{
		m_Income = Income;
	}
	
	public void PayTaxes(double TaxRate)
	{
		if(!m_donePayingTaxes)
		{
		double taxes = TaxRate * getIncome();
		double newIncome = getIncome() - taxes;
		setIncome(newIncome);
		m_donePayingTaxes = true;
		}
		else
		{
			System.out.println("Banker already paid taxes for this year.");
		}
	}
	
	public void FileTaxReturn()
	{
		if (m_donePayingTaxes)
		{
		System.out.println("Banker has filed tax return");
		}
		else
		{
			System.out.println("Banker needs to file taxes before filing return");
		}
	}
	
	public static void main(String[] args) 
	{
		Banker blankfein = new Banker(5000000);
		blankfein.PayTaxes(.33);
		blankfein.FileTaxReturn();
		
		SchoolTeacher doblar = new SchoolTeacher(30000);
		doblar.PayTaxes(.23);
		doblar.FileTaxReturn();
		
		Scientist hawking = new Scientist(1200000);
		hawking.PayTaxes(.28);
		hawking.FileTaxReturn();
		
		TaxAuditor tom = new TaxAuditor();
		tom.Audit(doblar);
		tom.Audit(hawking);
		tom.Audit(blankfein);

	}
	
}
