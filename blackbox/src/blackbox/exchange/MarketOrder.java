package blackbox.exchange;

import java.math.BigDecimal;
import java.util.Date;

public class MarketOrder extends AOrder{

	public MarketOrder(String accoundId, String ticker, BigDecimal size,
			OrderDirection direction, Date expiry) {
		super(accoundId, ticker, size, direction, expiry);
	}

	@Override
	public boolean canExecute(double price) {
		return true;
	}
	
	@Override
	public BigDecimal getExecutedPrice(double marketPrice) {
		return new BigDecimal(marketPrice);
	}

}
