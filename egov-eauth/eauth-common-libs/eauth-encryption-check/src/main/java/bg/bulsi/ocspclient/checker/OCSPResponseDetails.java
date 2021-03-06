package bg.bulsi.ocspclient.checker;

import java.util.ArrayList;
import java.util.List;

public class OCSPResponseDetails
{
    private boolean valid;
    private List<String> errors;
    private byte[] responseData;
    
    public OCSPResponseDetails()
    {
        this.valid = false;
        this.errors = new ArrayList<String>();
    }
    
    public OCSPResponseDetails(boolean valid, ArrayList<String> errors, byte[] responseData)
    {
        this.valid = valid;
        this.errors = errors;
        this.responseData = responseData;
    }
    
    public boolean isValid()
    {
        return valid;
    }
    
    public void setValid(boolean valid)
    {
        this.valid = valid;
    }
    
    public List<String> getErrors()
    {
        return errors;
    }
    
    public void setErrors(ArrayList<String> errors)
    {
        this.errors = errors;
    }
    
    public void addError(String error)
    {
        if (this.errors != null)
        {
            this.errors.add(error);
        }
    }

    public byte[] getResponseData()
    {
        return responseData;
    }

    public void setResponseData(byte[] responseData)
    {
        this.responseData = responseData;
    } 
    
    
	public void showDetails() {
		boolean isStatusValid = this.isValid();
		
		if (isStatusValid) {
			System.out.println("Certificate status is OK!");
		
		} else {
			System.out.println("There are errors in OCSP checking of the certificate:");
			for (String errorText : this.getErrors()) {
				System.out.println(errorText);
			}
		}
	}
	
}
