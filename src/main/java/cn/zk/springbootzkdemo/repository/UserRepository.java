package cn.zk.springbootzkdemo.repository;

import cn.zk.springbootzkdemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
