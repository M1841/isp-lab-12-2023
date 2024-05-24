package aut.utcluj.isp.app;

public class Account {
    static String username;
    static String password;

    Account(String username,String password) {
        this.username= username;
        this.password= password;

    }

    static Account createAccount(String username,String password) throws Exception {
        if(!AccountList.map.containsKey(username))
        {
            Account acc = new Account(username, password);
            AccountList.map.put(username,password);
            return acc;
        }
        else
        {
            throw new Exception("Username is taken");
        }
    }

    static Account loginAccount(String username, String password) throws Exception {
       if(AccountList.map.containsKey(username))
       {
           if(AccountList.map.get(username).equals(password))
           {
               Account acc = new Account(username, password);
               return acc;
           }
           else
           {
               throw new Exception("Password is incorect");
           }
       }
       else
       {
           throw new Exception("User doesn't exist");
       }
    }


}
