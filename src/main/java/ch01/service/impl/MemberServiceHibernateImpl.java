package ch01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch01.dao.MemberDao;
import ch01.dao.impl.MemberJdbcDaoImpl;
import ch01.model.MemberBean;
import ch01.service.MemberService;

@Transactional
@Service
public class MemberServiceHibernateImpl implements MemberService {

	MemberDao dao;
	
	@Autowired
	public MemberServiceHibernateImpl(MemberDao dao) {
		this.dao = dao;
	}
	
	@Override
	public boolean existsById(String id) {
		return dao.existsById(id);
	}

	@Override
	public void save(MemberBean mb) {
//		MemberDao dao = new MemberJdbcDaoImpl();
		dao.save(mb);
	}

	@Override
	public List<MemberBean> findAll() {
		return dao.findAll();
	}

	@Override
	public MemberBean findById(int pk) {
		return dao.findById(pk);
	}

	@Override
	public void delete(int ipk) {
		dao.delete(ipk);
	}

	@Override
	public void update(MemberBean mb) {
		dao.update(mb);
	}

}
