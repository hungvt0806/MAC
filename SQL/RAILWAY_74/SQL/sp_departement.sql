DROP PROCEDURE IF EXISTS sp_delete_department;
DELIMITER //
CREATE PROCEDURE sp_delete_department (IN_id INT UNSIGNED)
BEGIN
DELETE FROM Department  
WHERE department_id = IN_id ;
END //
DELIMITER ;

DROP PROCEDURE IF EXISTS sp_delete_account;
DELIMITER //
CREATE PROCEDURE sp_delete_account (IN_id INT UNSIGNED)
BEGIN
DELETE FROM `Account`  
WHERE department_id = IN_id ;
END //
DELIMITER ;

CALL sp_delete_account (3);