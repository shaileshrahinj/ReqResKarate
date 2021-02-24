function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) { //set to this if no info is provided
    env = 'dev';
  }
  var config = {
    env: env,
    myVarName: 'someValue'
  }
  if (env == 'dev') {
   //some application urls
	 baseurl= 'https://reqres.in/api'
	  //config.base URL=''
	  //config.mongo URL=''
	  //config.oracledb='connection string'
  } else if (env == 'qa') {
	//some application urls
	  //config.base URL=''
	  //config.mongo URL=''
	  //config.oracledb='connection string'
  }
//Timeout if a connection or servers don't respond within 5 seconds
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 10000);
  
  return config;
}