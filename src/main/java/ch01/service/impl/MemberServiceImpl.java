package ch01.service.impl;

import java.util.List;

import ch01.dao.MemberDao;
import ch01.dao.impl.MemberJdbcDaoImpl;
import ch01.model.MemberBean;
import ch01.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Override
	public boolean existsById(String id) {
		MemberDao dao = new MemberJdbcDaoImpl();
		return dao.existsById(id);
	}

	@Override
	public void save(MemberBean mb) {
		MemberDao dao = new MemberJdbcDaoImpl();
		dao.save(mb);
	}

	@Override
	public List<MemberBean> findAll() {
		MemberDao dao = new MemberJdbcDaoImpl();
		return dao.findAll();
	}

	@Override
	public MemberBean findById(int pk) {
		MemberDao dao = new MemberJdbcDaoImpl();
		return dao.findById(pk);
	}

	@Override
	public void delete(int ipk) {
		MemberDao dao = new MemberJdbcDaoImpl();
		dao.delete(ipk);
	}

	@Override
	public void update(MemberBean mb) {
		MemberDao dao = new MemberJdbcDaoImpl();
		dao.update(mb);
	}

}
