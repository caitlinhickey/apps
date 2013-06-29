public static void Main(string[] args)
{
  return;
}


public class Account{
	public double debitamt;
	public double creditamt;
	public string accountname;
	//public bool debitmain;
	public int acctnum;


	//constructor
	public Account(string name, int num){
	debitamt = 0;
	creditamt = 0;
	//totalamt = 0;
	accountname = name;
	//debitmain = main;
	acctnum = num;
	}

	//methods

	public void debit (double debitadd) {
	debitamt += debitadd;
	calctotal;
	}

	public void credit (double creditadd){
	creditamt +=creditadd;
	calctotal;
	}



}

public class Asset extends Account{
	public double totalamt;

	public void calctotal {
	totalamt = debitamt - creditamt;
	}
}	


public class Revenue extends Account {
	public double totalamt;

	public void calctotal {
	totalamt = creditamt-debitamt;
	}
	public void closeout{
	debitamt = 0;
	creditamt = 0;
	calctotal;
	//need to transfer these amounts to equity
	}
}

public class Equity extends Account {
	public double totalamt;
	public void calctotal {
		totalamt = creditamt-debitamt;
	}
	public void closeout{

	}

}
public class Misc extends Account {
	public double totalamt;
	public boolean debitmain;

	public void calctotal{
	if (debitmain == true) {
	totalamt = debitamt - creditamt;
	}else {
	totalamt = creditamt-debitamt;
	}


	}
}
