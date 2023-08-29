SELECT l.position_name,m.account_id,m.fullname
FROM `Account` AS m
INNER JOIN `Position` AS l
ON m.position_id = l.position_id;