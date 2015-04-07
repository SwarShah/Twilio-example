import java.util.*; 
import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
 
public class TwilioTest { 
  public static final String ACCOUNT_SID = "YOUR SID"; 
 public static final String AUTH_TOKEN = "YOUR AUTH TOKEN"; 
 
 public static void main(String[]args) throws TwilioRestException { 
	TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
 
	 // Build the parameters 
	 List<NameValuePair> params = new ArrayList<NameValuePair>(); 
	 params.add(new BasicNameValuePair("To", "+15191234567")); 
	 params.add(new BasicNameValuePair("From", "YOUR NUMBER")); 
	 params.add(new BasicNameValuePair("Body", "Hi there."));    
	 MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
	 Message message = messageFactory.create(params); 
	 System.out.println(message.getSid()); 
 } 
}