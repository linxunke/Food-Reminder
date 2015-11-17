package com.isc.remind.dao;

import com.isc.remind.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class FoodDaoImpl implements FoodDao {

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}


	@Override
	public List<Food> findAll() {

		String sql = "SELECT * FROM foods";
		List<Food> result = namedParameterJdbcTemplate.query(sql, new FoodMapper());

		return result;

	}

	private static final class FoodMapper implements RowMapper<Food> {

		public Food mapRow(ResultSet rs, int rowNum) throws SQLException {
			Food food = new Food();
			food.setId(rs.getInt("id"));
			food.setIcon(rs.getString("icon"));
			food.setName(rs.getString("name"));
			food.setQuantity(rs.getInt("quantity"));
			food.setExpiredate(rs.getString("expiredate"));
			return food;
		}
	}


}