let bunny = {};

bunny.str = {
    isEmpty: function (str) {
        return str == "undefined" || str == null || str.length == 0;
    },
    hasSpace: function (str) {
        return / /.test(str);
    },
    trim: function (str) {
        return str.replace(/(^\s*)|(\s*$)/gi, "");
    },
    split: function (str, separator) {
        return str.split(separator);
    }
};

bunny.ajax = {
    call: function (type, url, param, callBack) {
        const token = $("meta[name='_csrf']").attr("content");
        const header = $("meta[name='_csrf_header']").attr("content");

        $.ajax({
            type: type,
            url: url,
            data: param,
            //dataType: "json",
            //contentType: 'application/json',
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success: function (data, textStatus, xhr) {
                return callBack(data);
            },
            error: function (data, textStatus, error) {
                alert(data.msg);
                // return callBack(data);
            }
        });
    },
};

bunny.fileUpload = {
    call: function (files, path, callback) {
        let formData = new FormData();
        formData.append('path', path);

        for (let i = 0; i < files.length; i++) {
            const file = files[i];

            const extension = file.name.split(".").pop().toLowerCase();
            const allowedExtensions = [
                'jpg', 'jpeg', 'png', 'gif', 'bmp', 'webp',
                'heic', 'svg', 'mp4', 'webm', 'ogg', 'mov',
                'avi', 'flv'
            ];

            if (!allowedExtensions.includes(extension)) {
                alert('현재 선택된 파일 형식은 업로드가 불가능합니다.');
                return;
            }

            const allowedTypes = ["image/jpeg", "image/png", "image/gif"];
            if (!allowedTypes.includes(file.type)) {
                alert('현재 선택된 파일 형식은 업로드가 불가능합니다.');
                return;
            }

            const maxFileSize = 1024 * 1024 * 5;
            if (file.size > maxFileSize) {
                alert('5MB 이하의 이미지 파일만 업로드 가능합니다.');
                return;
            }

            formData.append('files', file);
        }

        $.ajax({
            type: 'POST',
            url: '/util/file-upload',
            data: formData,
            enctype: 'multipart/form-data',
            processData: false,
            contentType: false,
            cache: false,
            success: function (data, textStatus, xhr) {
                return callback(data);
            },
            error: function (data, textStatus, error) {
                alert('오류가 발생하였습니다. 관리자에게 문의해 주세요.');
            }
        });
    }
};