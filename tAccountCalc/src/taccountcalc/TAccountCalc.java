/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taccountcalc;

/**
 *
 * @author Mike
 */

public class TAccountCalc{
	public double debitamt;
	public double creditamt;
	public String accountname;
	public boolean debitmain;
	public int acctnum;
        public double totalamt;
        
        public static void main(String[] args)
        {
          return;
        }


	//constructor
	public TAccountCalc(String name, int num){
	debitamt = 0;
	creditamt = 0;
	totalamt = 0;
	accountname = name;
	debitmain = true;
	acctnum = num;
	}

	//methods
	public void calctotal(){
	if (debitmain == true) {
	totalamt = debitamt - creditamt;
	}else {
	totalamt = creditamt-debitamt;
	}
	}
	public void debit (double debitadd) {
	debitamt += debitadd;
	calctotal();
	}

	public void credit (double creditadd){
	creditamt +=creditadd;
	calctotal();
	}



}

public class Asset extends TAccountCalc{
	public double totalamt;

}	

public class Liability extends Account{
	public double totalamt;

}

public class Expense extends Account {
	public double totalamt;

	public void closeout(){
	this.debitamt = 0;
	this.creditamt = 0;
	calctotal();
	}
}

public class Revenue extends Account {
	this.debitmain = false;

	public void closeout(){
	debitamt = 0;
	creditamt = 0;
	calctotal();
	//need to transfer these amounts to equity
	}
}

public class Equity extends Account {
	this.debitmain = false;
	
	public void closeout(){

	}

}
public class Misc extends Account {

	

}


