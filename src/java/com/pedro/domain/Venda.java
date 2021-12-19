
package com.pedro.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Venda implements Serializable {
    private Integer id;
    private Timestamp data_hora;

    public Venda(){
    }

    public Venda(Integer id, Timestamp data_hora) {
        this.id = id;
        this.data_hora = data_hora;
    }

    public Integer getId() {
        return id;
    }

    public Timestamp getData_hora() {
        return data_hora;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setData_hora(Timestamp data_hora) {
        this.data_hora = data_hora;
    }
}
