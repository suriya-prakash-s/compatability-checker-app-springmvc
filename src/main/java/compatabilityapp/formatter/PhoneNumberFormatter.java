package compatabilityapp.formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Logger;

import org.springframework.format.Formatter;

import compatabilityapp.dto.PhoneDto;

public class PhoneNumberFormatter implements Formatter<PhoneDto>{
	
	static Logger logger = Logger.getLogger(PhoneNumberFormatter.class.getName());

	@Override
	public String print(PhoneDto phone, Locale locale) {
		logger.info("*****Inside print() of PhoneNumberFormatter*****");
		return phone.getCountryCode()+"-"+phone.getPhoneNumber();
	}

	@Override
	public PhoneDto parse(String text, Locale locale) throws ParseException {
		logger.info("*****Inside parse() of PhoneNumberFormatter*****");
		String[] arr = text.split("-");
		PhoneDto phone = new PhoneDto();
		phone.setCountryCode(arr[0]);
		phone.setPhoneNumber(arr[1]);
		return phone;
	}

}
