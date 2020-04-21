package community.xumingxiao.community.mapper;
import community.xumingxiao.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    @Insert("Insert into user(name,ACCOUNT_ID,token,gmt_create,gmt_modified) values (#{name},#{ACCOUNT_ID},#{token},#{gmt_create},#{gmt_modified})")
    void insert(User user);
}