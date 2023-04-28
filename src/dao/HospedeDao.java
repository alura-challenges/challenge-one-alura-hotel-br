package dao;

import java.sql.Connection;

public class HospedeDAO {
	private final Connection con;

    public HospedeDAO(Connection con) {
        this.con = con;
    }
}
