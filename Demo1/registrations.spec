//***************************************************** Declare Var ***********************************************************
nsl_decl_var(DynaTraceHdr);

//********************************************** CheckPoints **************************************************************
nsl_web_find(TEXT="monthlyMedia", PAGE=BB_Content, FAIL=NOTFOUND, ID="Count not Available", ActionOnFail=CONTINUE);