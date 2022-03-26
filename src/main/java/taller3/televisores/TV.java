package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    private static int numTV;
    public TV(Marca marca, boolean estado) {
    	this.marca=marca;
    	this.estado=estado;
    	TV.numTV+=1;
    }
    public void setMarca(Marca marca) {
    	this.marca=marca;
    }
    public Marca getMarca() {
    	return marca;
    }
    public void setNumTV(int num) {
    	numTV=num;
    }
    public int getNumTV() {
    	return TV.numTV;
    }
    public void setControl(Control control) {
    	this.control=control;
    }
    public Control getControl() {
    	return control;
    }
    public void setPrecio(int precio) {
    	this.precio=precio;
    }
    public int getPrecio() {
    	return precio;
    }
    public void setVolumen(int volumen) {
    	this.volumen=volumen;
    }
    public int getVolumen() {
    	return volumen;
    }
    public void setCanal(int canal) {
    	this.canal=canal;
    }
    public int getCanal() {
    	return canal;
    }
    public void turnOn() {
    	estado=true;
    }
    public void turnOff() {
    	estado=false;
    }
    public boolean getEstado() {
    	return estado;
    }
    public void canalUp() {
    	if (canal==120) {
    		return;
    	}
    	else {
    		if (estado==true) {
    			canal+=1;
    		}
    		else {
    			return;
    		}
    	}
    }
    public void canalDown() {
    	if (canal==1) {
    		return;
    	}
    	else {
    		if (estado==true) {
    			canal-=1;
    		}
    		else {
    			return;
    		}
    	}
    }
    public void volumenUp() {
    	if (volumen==7) {
    		return;
    	}
    	else {
    		if (estado==true) {
    			volumen+=1;
    		}
    		else {
    			return;
    		}
    	}
    }
    public void volumenDown() {
    	if (volumen==0) {
    		return;
    	}
    	else {
    		if (estado==true) {
    			volumen-=1;
    		}
    		else {
    			return;
    		}
    	}
    }
}
