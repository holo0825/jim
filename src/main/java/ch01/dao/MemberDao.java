package ch01.dao;

import java.util.List;

import ch01.model.MemberBean;

public interface MemberDao {

	boolean existsById(String id);

	void save(MemberBean mb);

	List<MemberBean> findAll();

	MemberBean findById(int pk);

	void delete(int pk);

	void update(MemberBean mb);

}