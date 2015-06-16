
public class Scientist implements ITaxPayer
{
	private double m_Income;
	private boolean m_donePayingTaxes = false;
	
	public Scientist(double Income)
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
			System.out.println("Scinetist has filed tax return");
			}
			else
			{
				System.out.println("Scientist needs to file taxes before filing return");
			}
		}
	}	

