package com.cjass.web.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cjass.web.member.dao.MemberDao;
import com.cjass.web.util.SHA256;

@Service
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;

	int result = 0;

	public List getAllMember(Map map) {
		return memberDao.getAllMember(map);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public int updateMember(Map map) {
		map.put("pw", SHA256.encryptSHA256((String) map.get("pw")));
		return memberDao.updateMember(map);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public int deleteMember(Map map) {
		return memberDao.deleteMember(map);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public int insertMember(Map map) throws Exception {
		try {
			map.put("pw", SHA256.encryptSHA256((String) map.get("pw")));
			result = memberDao.insertMember(map);
			System.out.println("LAST_INSERT_ID SEQ:" + map.get("seq"));
			if (0 != result) {
//				result = memberDao.deleteMember(map);
				if (1 == result) {
					// success!
//					throw new Exception();
				} else {
					// fail!
				}
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw e;
		}
		return result;
	}

}
