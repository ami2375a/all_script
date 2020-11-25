/*-----------------------------------------------------------------------------
    Name: flow
    Recorded By: amit
    Date of recording: 11/11/2020 01:01:42
    Flow details:
    Build details: 4.3.0 (build# 103)
    Modification History:
-----------------------------------------------------------------------------*/
package com.cavisson.scripts.BB_Content;
import pacJnvmApi.NSApi;

public class flow implements NsFlow
{
    public int execute(NSApi nsApi) throws Exception
    {
        int status = 0;
      
    status = nsApi.ns_start_transaction("BB_Content");	
	status = com.cavisson.scripts.BB_Content.nsApi.ns_web_url ("BB_Content",
         "URL=https://www.macys.com/xapi/subscription/v1/content/about?_expand=other_media",
         "HEADER=Content-Type: application/json"
   );
	status = nsApi.ns_end_transaction("BB_Content", NS_AUTO_STATUS);
  
        return status;
    }
}
