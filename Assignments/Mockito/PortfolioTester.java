import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
public class PortfolioTester 
{
   public static void main(String[] args)
{
      //Create a portfolio test object		
      Portfolio portfolio = new Portfolio();

      //Creates a list of stocks
      List<Stock> stocks = new ArrayList<Stock>();
      Stock googleStock = new Stock("1","Google", 10);
      Stock microsoftStock = new Stock("2","Microsoft",100);

      stocks.add(googleStock);
      stocks.add(microsoftStock);		

      //Create the mock object of stock
      StockService stockServiceMock = mock(StockService.class);

      when(stockServiceMock.getPrice(googleStock)).thenReturn(50.00);
      when(stockServiceMock.getPrice(microsoftStock)).thenReturn(1000.00);

      //add stocks to the portfolio
      portfolio.setStocks(stocks);

      //set the stockService 
      portfolio.setStockService(stockServiceMock);

      double marketValue = portfolio.getMarketValue();

      //10*50.00 + 100* 1000.00 = 500.00 + 100000.00 = 100500
      System.out.println("Market value of the portfolio: "+ marketValue);
   }
}
