package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;

public class ActorDB extends BaseDB {
	
	public List<Actor> list() {
		List<Actor> actorList = new ArrayList<>();
		String sql = "SELECT * from actor";
		try (PreparedStatement ps = getConnection().prepareStatement(sql); 
			ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actorList.add(a);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return actorList;
	}

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		// Get a actor from the result set
		int id = rs.getInt(1);
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		LocalDate ld = rs.getDate(5).toLocalDate();
		
		Actor a = new Actor(id, firstName, lastName, gender, ld);
		return a;
	}
}
