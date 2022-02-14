package com.webapp.bookmyshowapp.messages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@PropertySource("classpath:messages.properties")
@Getter@Setter
public class CommonErrorMessageConstant {
	
	@Value("${error.field.blank}")
	private String blankError;
	
	@Value("${error.uniquekey}")
	private String uniqueKeyError;
	
	@Value("${error.field.empty}")
	private String emptyError;

	public String getBlankError() {
		return blankError;
	}

	public void setBlankError(String blankError) {
		this.blankError = blankError;
	}

	public String getUniqueKeyError() {
		return uniqueKeyError;
	}

	public void setUniqueKeyError(String uniqueKeyError) {
		this.uniqueKeyError = uniqueKeyError;
	}

	public String getEmptyError() {
		return emptyError;
	}

	public void setEmptyError(String emptyError) {
		this.emptyError = emptyError;
	}
}
