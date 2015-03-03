package pams.view.test;



import java.io.Serializable;
import javax.faces.flow.FlowScoped;


//@Named
//@FlowScoped(id = "flow1")
public class Flow1Bean implements Serializable {

    public Flow1Bean() {
        System.out.println("Flow1Bean.ctor");
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
