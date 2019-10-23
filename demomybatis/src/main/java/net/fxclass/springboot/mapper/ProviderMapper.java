package net.fxclass.springboot.mapper;

import net.fxclass.springboot.entities.Provider;
import org.apache.ibatis.annotations.*;


public interface ProviderMapper {

    @Select("select * from provider where pid=#{pid}")
    Provider getProviderByPid(Integer pid);

    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into provider(providerName) values(#{providerName})")
    int addProvider(Provider provider);

    @Update("update provider set providerName=#{providerName} where pid=#{pid}")
    int updateProvider(Provider provider);

}
