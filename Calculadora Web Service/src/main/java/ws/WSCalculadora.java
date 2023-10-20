/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import logic.Calculadora123;
/**
 *
 * @author Daniel
 */
@WebService(serviceName="WSCalculadora")
public class WSCalculadora {


Calculadora123 calc1 = new Calculadora123();

    /** This is a sample web service operation */
    @WebMethod(operationName="sumar")
    public int sumar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return calc1.sumar(a,b);
    }
@WebMethod(operationName="restar")
    public int restar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return calc1.restar(a,b);
    }@WebMethod(operationName="multiplicar")
    public int multiplicar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return calc1.multiplicar(a,b);
    }@WebMethod(operationName="dividir")
    public int dividir(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return calc1.dividir(a,b);
    }

}
