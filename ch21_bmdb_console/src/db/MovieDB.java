package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB extends BaseDB {
	
	public List<Movie> list() {
		List<Movie> movieList = new ArrayList<>();
		String sql = "SELECT * from movie";
		try (PreparedStatement ps = getConnection().prepareStatement(sql); 
			ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Movie m = getMovieFromResultSet(rs);
				movieList.add(m);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movieList;
	}
	
	public Movie get(int id) {
		Movie movie = null;
		String sql = "SELECT * from movie "+
					 "WHERE id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				movie = getMovieFromResultSet(rs);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movie;
	}
	
	public int add(Movie m) {
		int rowCount = 0;
		String sql = "insert into Movie (title,year,rating,director) VALUES" + 
				" (?, ?, ?, ?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public int update(Movie m) {
		int rowCount = 0;
		String sql = "update Movie set year = ? where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, m.getYear());
			ps.setInt(2, m.getId());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public int delete(Movie m) {
		int rowCount = 0;
		String sql = "delete from Movie where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, m.getId());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	private Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
		// Get a movie from the result set
		int id = rs.getInt(1);
		String title = rs.getString(2);
		int year = rs.getInt(3);
		String rating = rs.getString(4);
		String director = rs.getString(5);
		Movie m = new Movie(id, title, year, rating, director);
		return m;
	}
}
