package dao;

import java.sql.Connection;

public class HospedeDao {
	private final Connection con;

    public HospedeDao(Connection con) {
        this.con = con;
    }
}
