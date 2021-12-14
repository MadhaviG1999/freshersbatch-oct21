import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TestTaxTest {
	 TaxOnSalary tax1;
	 @BeforeEach void init() 
	 { tax1=new TaxOnSalary(); 
	 } @Test 
	 final void testgetSalary() 
	 { 
		 TaxOnSalary tax0=new TaxOnSalary(); 
		 double salary=1000.0; 
		 double expected=0.0; 
		 assertEquals(0.0,tax1.getSalary()); 
		 } 
	 @Test 
	 void voidisPANsubmitted() 
	 { 
		 assertEquals(false,tax1.getIsPANsubmitted()); 
		 } @Test 
	 void testCalculateTax1() 
		 { 
			 double salary=10000.00; 
			 boolean m=tax1.getIsPANsubmitted(); 
			 String expected="Tax payable should be zero"; 
			 String actual="Tax payable should be zero"; 
			 assertEquals(expected,actual); 
			 } @Test 
		 void testCalculateTaxOfSecond()
			 { 
				 double salary=170000.0; 
				 boolean m=false; 
				 double exp=8500.00; 
				 double act=0.05*salary; 
				 assertEquals(exp,act); 
				 } @Test 
			 void testCalculateTaxOfThird() { 
					 double salary=150000.0; 
					 boolean m=false;
					 double exp=15000; 
					 double act=0.1*salary; 
					 assertEquals(exp,act); 
					 } 
				 @Test void testCalculateTaxOfFourth() 
				 { 
					 double salary=2000000.0; 
					 boolean m=false;
					 double exp=400000;
					 double act=0.2*salary;
					 assertEquals(exp,act); 
					 } 
				 @Test void testFifthTax() 
				 { 
					 double salary=1400000.00; 
					 boolean m=false; 
					 double exp=420000; 
					 double act=0.3*salary; 
					 assertEquals(exp,act); } 
}
