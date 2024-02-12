package junit.nama.junit.argumentconverter;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ImplicitConversionEx {

	@ParameterizedTest
	@CsvSource({"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"}) // Pssing strings
	void someMonths_Are30DaysLongCsv(Month month) {
	    final boolean isALeapYear = false;
	    assertEquals(30, month.length(isALeapYear));
	}
	
	/*
	This seems like it shouldn't work, but it somehow does.

	JUnit 5 converts the String arguments to the specified enum type. To support use cases like this, 
	JUnit Jupiter provides a number of built-in implicit type converters.

	The conversion process depends on the declared type of each method parameter. 
	The implicit conversion can convert the String instances to types such as the following:

	UUID 
	Locale
	LocalDate, LocalTime, LocalDateTime, Year, Month, etc.
	File and Path
	URL and URI
	Enum subclasses
    */
}
