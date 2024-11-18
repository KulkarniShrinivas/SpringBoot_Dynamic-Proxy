package SpringBoot.Proxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {

    private Person person;

    public PersonInvocationHandler(Person person) {
        this.person = person;
    }

//whenever we call person interface then invoke method will be called first
//this method will be called first before the actual method of the person interface

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Hi");
        return null;
    }
}
