package compatabilityapp.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDto {
	@NotBlank(message = "*name should not be blank")
//	@Min(value = 2, message = "*name should be atleast 3 characters")
	@Size(min = 2,max = 15, message = "*name should be atleast 3 characters")
	private String yourName;
	private String crushName;
	@AssertTrue(message = "*Agree to terms and conditions")
	private boolean termsAndConditonsIsAgreed;
	
	public String getYourName() {
		return yourName;
	}
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	public boolean getTermsAndConditonsIsAgreed() {
		return termsAndConditonsIsAgreed;
	}
	public void setTermsAndConditonsIsAgreed(boolean termsAndConditonsIsAgreed) {
		this.termsAndConditonsIsAgreed = termsAndConditonsIsAgreed;
	}


}
