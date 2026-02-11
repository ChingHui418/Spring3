package tw.hui.spring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.hui.spring3.entity.Member;
import tw.hui.spring3.entity.Profile;
import tw.hui.spring3.repo.MemberRepo;
import tw.hui.spring3.repo.ProfileRepo;
import tw.hui.spring3.util.BCrypt;

@Service
public class MemberService {
	@Autowired private MemberRepo memberRepo;
	@Autowired private ProfileRepo profileRepo;
	
	@Transactional
	public Member save(Member member, Profile profile) {
		member.setPasswd(BCrypt.hashpw(member.getPasswd(), BCrypt.gensalt()));
		member.setProfile(profile);
		return memberRepo.save(member);
	}
	
}
