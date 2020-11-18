/*-----------------------------------------------------------------------------
    Name: flow
    Recorded By: Akshay
    Date of recording: 05/09/2016 02:32:08
    Flow details:
    Build details: 4.1.4 (build# 40)
    Modification History:
-----------------------------------------------------------------------------*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ns_string.h"
void flow()
{



  ns_start_transaction("BB_Content");
 	ns_web_url ("BB_Content",
         "URL=https://www.macys.com/xapi/subscription/v1/content/about?_expand=other_media",
         "HEADER=Accept-Language:en-us,en;q=0.5",
         "HEADER=Content-Type: application/json"
   );
	ns_end_transaction("BB_Content", NS_AUTO_STATUS);
    ns_page_think_time(2.0);



}
