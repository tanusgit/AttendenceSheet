package attendence;

public class Register {
boolean reg;

public boolean isReg() {
	return reg;
}

public void setReg(boolean reg) {
	this.reg = reg;
}

public Register(boolean reg) {
	super();
	this.reg = reg;
}

@Override
public String toString() {
	return " " + reg + "]";
}

}
