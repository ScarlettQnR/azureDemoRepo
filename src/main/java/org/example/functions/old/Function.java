//package org.example.functions;
//
//import com.microsoft.azure.functions.ExecutionContext;
//import com.microsoft.azure.functions.HttpMethod;
//import com.microsoft.azure.functions.annotation.AuthorizationLevel;
//import com.microsoft.azure.functions.annotation.HttpTrigger;
//
//public class Function {
//    public String echo(@HttpTrigger(name = "req",
//            methods = {HttpMethod.POST},  authLevel = AuthorizationLevel.ANONYMOUS)
//                               String req, ExecutionContext context) {
//        return String.format(req);
//    }
//}
